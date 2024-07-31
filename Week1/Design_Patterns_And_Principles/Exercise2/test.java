public class FactoryMethodTest {
    public static void main(String[] args) {
        // Step 5.1: Create factory instances
        DocumentFactory wordFactory = new WordFactory();
        DocumentFactory pdfFactory = new PdfFactory();
        DocumentFactory excelFactory = new ExcelFactory();

        // Step 5.2: Use factories to create documents
        Document wordDoc = wordFactory.createDocument();
        Document pdfDoc = pdfFactory.createDocument();
        Document excelDoc = excelFactory.createDocument();

        // Step 5.3: Open documents
        wordDoc.open();
        pdfDoc.open();
        excelDoc.open();
    }
}
