package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by hidagara on 31.08.2016.
 */
public abstract class ImageReaderFactory
{
   static  ImageReader getReader (ImageTypes reader)
   {
       if (reader == ImageTypes.JPG)
           return new JpgReader();
       if (reader == ImageTypes.BMP)
           return new BmpReader();
       if (reader == ImageTypes.PNG)
           return new PngReader();
       else throw new IllegalArgumentException("Неизвестный тип картинки");
   }

}
