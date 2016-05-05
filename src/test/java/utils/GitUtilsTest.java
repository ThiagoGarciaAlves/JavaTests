package utils;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GitUtilsTest {

    @Test
    public void test001() throws IOException, GitAPIException {

        GitUtils gitUtils = new GitUtils();

        String repoPath = "/tmp/git-test";

        Repository repository = gitUtils.getRepository(repoPath);

        List<File> files = new ArrayList<File>();

        files.add(new File(repoPath, "File001"));
        files.add(new File(repoPath+"/java", "File002"));
        files.add(new File(repoPath+"/test", "File003"));

        for (File file : files) {
            file.delete();
            file.getParentFile().mkdirs();
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(new Date().toString());
            fileWriter.close();
        }

        gitUtils.addAll(repository);

        gitUtils.commit(repository, "An commit");

    }

}
