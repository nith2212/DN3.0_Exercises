public abstract class Document {
    public abstract void open();
}

public class WordDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening a Word document.");
    }
}

public class PdfDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}

public class ExcelDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening an Excel document.");
    }
}
