package utils;

import com.lowagie.text.DocumentException;
import org.apache.commons.lang3.StringEscapeUtils;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PDFUtils {

    public void createPdf(String htmlContent, String pdfPath) throws DocumentException, IOException {

        String unescapedContent = StringEscapeUtils.unescapeHtml4(htmlContent);
        String finalContent = unescapedContent.replace("&", "&amp;");

        ITextRenderer renderer = new ITextRenderer();

        renderer.setDocumentFromString(finalContent);
        renderer.layout();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        renderer.createPDF(baos);

        FileOutputStream fos = new FileOutputStream(pdfPath);
        fos.write(baos.toByteArray());
        fos.close();

    }
}
