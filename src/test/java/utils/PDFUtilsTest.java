package utils;

import com.lowagie.text.DocumentException;
import org.junit.Test;

import java.io.IOException;

public class PDFUtilsTest {

    PDFUtils pdfUtils = new PDFUtils();

    @Test
    public void createPDFTest() throws IOException, DocumentException {

        String htmlContent = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Strict//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd'>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <style type='text/css'>\n" +
                "        body {\n" +
                "            font-family: 'Roboto', sans-serif;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "    <h1>TESTE DE GERAÇÃO DE PDF</h1>\n" +
                "</body>\n" +
                "</html>";

        String pdfPath = "/tmp/pdfTest.pdf";

        pdfUtils.createPdf(htmlContent, pdfPath);

    }

}
