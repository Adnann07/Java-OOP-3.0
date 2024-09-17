/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demofile;

/**
 *
 * @author HP
 */
public class AdobeAcrobat extends PDFViewer{
        
        @Override
        public void view(String fileName)
        {
            System.out.println("viewing file: "+fileName);
        }
        @Override
        public void Highlight(String T)
    {
        System.out.println("Highlighting text: "+T);
    }
        @Override
    public void changeView(double S,String Type)
    {
        System.out.println(Type+",Size by: "+S);
    }

    
}
