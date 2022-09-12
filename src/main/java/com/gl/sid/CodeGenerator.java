package com.gl.sid;

import com.gl.sid.generators.BackGenerator;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

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

     BackGenerator backGenerator = new BackGenerator();
     //backGenerator.generateEntity("Person","nom");
        backGenerator.generateEntityFile("hello");


    }

}