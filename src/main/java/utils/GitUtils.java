package utils;

import org.eclipse.jgit.api.AddCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

import java.io.File;
import java.io.IOException;

public class GitUtils {

    public Repository createRepository(String path) throws IOException {
        File directory = new File(path);
        directory.delete();
        directory.mkdirs();

        Repository repository = FileRepositoryBuilder.create(new File(directory, ".git"));
        repository.create();

        return repository;
    }

    public Repository getRepository(String path, Boolean createIfNotExists) throws IOException {
        File directory = new File(path);

        FileRepositoryBuilder repositoryBuilder = new FileRepositoryBuilder();
        Repository repository = repositoryBuilder.setGitDir(new File(directory, ".git"))
                .readEnvironment()
                .findGitDir()
                .build();

        if (repository == null && createIfNotExists) {
            repository = createRepository(path);
        }

        return repository;
    }

    public Repository getRepository(String path) throws IOException {
        return getRepository(path, true);
    }

    public void addAll(Repository repository) throws GitAPIException {
        Git git = new Git(repository);
        git.add().addFilepattern(".").call();
    }

    public void commit(Repository repository, String message) throws GitAPIException {
        Git git = new Git(repository);
        git.commit().setMessage(message).call();
    }

}
