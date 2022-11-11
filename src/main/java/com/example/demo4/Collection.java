package com.example.demo4;

import javafx.scene.image.Image;

import java.io.File;

public class Collection implements Aggregate //Интерфейс - заявление, что где-то реализуются методы
{
    private String filetop;
    private Image bi;

    @Override
    public Iterator getIterator() {
        return new ImageIterator();
    }
    public Collection(String filetop)
    {
        this.filetop=filetop;
    }
    private class ImageIterator implements Iterator
    {
        private int current=1;

        @Override
        public boolean hasNext() {
            String filename="file:"+filetop+current+".png";
            System.out.println(filename);
            File file=new File(filetop+current+".png");
            if (file.exists())
            {
                bi=new Image(filename);
                return true;
            }
            else
            {
                return false;
            }
        }

        @Override
        public Object next() {
           if (current!=5 &&this.hasNext())
           {
               current++;
           }
           else
           {
              System.out.println("Сброс!");
               current=1;
               hasNext();
           }
            return bi;
        }

        @Override
        public Object preview() {
            if (current!=1 && this.hasNext())
            {
                current--;

            }
            else
            {
                System.out.println("Сброс!");
                current=4;
                hasNext();
            }
            return bi;
        }
    }

}
