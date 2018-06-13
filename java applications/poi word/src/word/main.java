package word;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.*;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by saeedtavana on 3/11/18.
 */
public class main {
    public static void main(String[] args)throws Exception {
        XWPFDocument document = new XWPFDocument();
        File file=new File("firstPoi.docx");
        FileOutputStream fileOutputStream=new FileOutputStream(file);

        XWPFParagraph paragraph=document.createParagraph();
        XWPFRun run=paragraph.createRun();
        paragraph.setAlignment(ParagraphAlignment.CENTER);
        run.setText("hello this is the first word using java");
        run.addBreak();
        run.setText("i am mohammad saed tavana");
        run.setBold(true);
        run.setColor("ff0000");
        run.setFontSize(20);
        paragraph.setBorderTop(Borders.BASIC_BLACK_DASHES);
        paragraph.setBorderBottom(Borders.BASIC_WHITE_DASHES);
        paragraph.setBorderLeft(Borders.BASIC_BLACK_DASHES);
        paragraph.setBorderRight(Borders.BASIC_WHITE_DASHES);
        paragraph.setBorderBetween(Borders.BASIC_BLACK_DASHES);

        XWPFParagraph paragraph1=document.createParagraph();
        XWPFRun run1=paragraph1.createRun();
        run1.addBreak();
        run1.addBreak();
        run1.setText("this is the second paragraph ");
        run1.setFontSize(22);
        run1.addBreak();
        run1.setItalic(true);
        //run1.setStrike(true);//use to deprecate
        XWPFTable table=document.createTable();
        //first row of the table
        XWPFTableRow tableRowone=table.getRow(0);
        XWPFRun run2=tableRowone.addNewTableCell().addParagraph().createRun();
        run2.setText("id");
        run2.setBold(true);run2.setColor("ff0000");
        run2.setFontSize(15);
        //tableRowone.getCell(0).setText("id");
        XWPFRun run3=tableRowone.createCell().addParagraph().createRun();
        run3.setText("name");
        run3.setBold(true);run3.setColor("ff0000");
        run3.setFontSize(15);
        tableRowone.createCell().setText("family");
        tableRowone.createCell().setText("phone");
        //second row
        XWPFTableRow tableRowtwo=table.createRow();
        tableRowtwo.getCell(0).setText("1");
        tableRowtwo.getCell(1).setText("saeed");
        tableRowtwo.getCell(2).setText("tavana");
        tableRowtwo.getCell(3).setText("44201170");
        //third row
        XWPFTableRow tableRowthree=table.createRow();
        tableRowthree.getCell(0).setText("2");
        tableRowthree.getCell(1).setText("javad");
        tableRowthree.getCell(2).setText("tavana");
        tableRowthree.getCell(3).setText("44201170");


        //add image
        XWPFParagraph paragraph2=document.createParagraph();
        paragraph2.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun run4=paragraph2.createRun();
        String imagefile="car.jpg";
        FileInputStream inputStream=new FileInputStream(imagefile);
        run4.addBreak();
        run4.addPicture(inputStream,XWPFDocument.PICTURE_TYPE_JPEG,imagefile, Units.toEMU(200),Units.toEMU(200));
        inputStream.close();
        run4.addBreak(BreakClear.RIGHT);

        document.write(fileOutputStream);
        fileOutputStream.close();

        System.out.println("--------- read from the word document ------------");
        File file1=new File("firstPoi.docx");
        FileInputStream fileImageInputStream=new FileInputStream(file1);

        XWPFDocument document1=new XWPFDocument(fileImageInputStream);
        XWPFWordExtractor extractor=new XWPFWordExtractor(document1);
        System.out.println(extractor.getText());

    }
}
