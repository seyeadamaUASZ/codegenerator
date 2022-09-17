package com.gl.sid;

import com.gl.sid.generators.BackGenerator;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CodeGenerator {
    public static void main(String[] args) throws IOException {
        /*TypeSpec helloWorld = TypeSpec.classBuilder("HelloWorld")
                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                .addMethod(whatsMyName("slimShady"))
                .addMethod(whatsMyName("eminem"))
                .addMethod(whatsMyName("marshallMathers"))
                .build();

        JavaFile javaFile = JavaFile.builder("sid.entity", helloWorld)
                .build();

        String despath="C:/Users/dell/Downloads/demandefra/codeGenerator/src/main/java/com/gl";
        Path path = Paths.get(despath);

        javaFile.writeTo(path);
    }

    private static MethodSpec whatsMyName(String name) {
        return MethodSpec.methodBuilder(name)
                .returns(String.class)
                .addStatement("return $S", name)
                .build();
    }*/

    List<String> champs = new ArrayList<>();
    champs.add("name");
    champs.add("firstname");
    champs.add("phone");

     //BackGenerator backGenerator = new BackGenerator();
     //backGenerator.generateEntity("Voiture","nom");
        //backGenerator.generateEntityFile("person",champs);
       //backGenerator.generateFile()
       

       String mot ="matam";
       if(palindrome2(mot)){
         System.out.println(mot +" est palindrome !!!");
       }else{
         System.out.println("Non palindrome ");
       }
      
      
}
    



    public static boolean palindrome(String mot){
        //String mot ="adama";
      char[] elements = mot.toCharArray();
      String inverse =""; 

      for(int i= elements.length-1 ;i>=0;i--){
        System.out.println(elements[i]);
        inverse = inverse+elements[i];
      }

      System.out.println(inverse);

      if(mot.equals(inverse)){
        return true;
      }else{
        return false;

    }    

}


public static boolean palindrome2(String mot){
    StringBuilder mot3 = new StringBuilder(mot).reverse();
    String mot4 = mot3.toString();
    if(mot.equals(mot4)){
       return true;
    }else{
       return false;
    }
    
}

}