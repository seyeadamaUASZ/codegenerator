package com.gl.sid.generators;

import com.gl.sid.tools.StringProcess;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BackGenerator {
    public String repo = "/codeGenerator";
    public String packagename="com.gl.sid";
    public String importKey="import";
    public String packageKey="package";
    public String dossierPackage="src/main/java/com/gl/sid";

    public static String capitalize(String str){
        return  str ==null || str.isEmpty() ? str : str.substring(0,1).toUpperCase()+str.substring(1);
    }

    public String getMappingObjet(String nomObjet){
        String mots = "";
        String[] tab = nomObjet.split("_");
        for (int i = 1; i < tab.length; i++) {
            mots = mots + tab[i];
        }
        return mots;

    }

    public String getMappingChamps(String champs) {
        StringProcess uppercasefunct = new StringProcess();
        String[] tab = champs.split("_");
        String mots = tab[0] + uppercasefunct.capitalize(tab[1]);
        return mots;
    }

    public void generateEntityFile(String entity) throws IOException {
        System.out.println("hello generator ");
        StringProcess upperCas = new StringProcess();
        File packentity = new File(this.repo + "/" + this.dossierPackage + "entity");
        packentity.mkdirs();
        File controllerfiles = new File(packentity, "" + upperCas.capitalize(entity) + ".java");
        controllerfiles.createNewFile();

        String fileJava = this.packageKey+ " "
                 +".entity;\n"+"\n"
                 +"import java.io.Serializable;\n"
                 +"import com.gl.sid.generators\n"
                 +"public class "+upperCas.capitalize(entity)+" implements Serializable {\n"
                 + "   private static final long serialVersionUID = 1L;\n";


        fileJava = fileJava + "}" ;

        FileWriter myWriteEntity = new FileWriter(packentity + "/" + capitalize(entity) + ".java");
        myWriteEntity.write ("\n"+fileJava);
        myWriteEntity.close();


    }

    public void generateEntity(String entity, String name) throws IOException {
        System.out.println("generate class file !!!");
        StringProcess upperCas = new StringProcess();
        FieldSpec name1 = FieldSpec
                .builder(String.class, name)
                .addModifiers(Modifier.PRIVATE)
                .build();

        TypeSpec person = TypeSpec
                .classBuilder(upperCas.capitalize(entity))
                .addModifiers(Modifier.PUBLIC)
                .addField(name1)
                .addMethod(MethodSpec
                        .methodBuilder("get"+upperCas.capitalize(name))
                        .addModifiers(Modifier.PUBLIC)
                        .returns(String.class)
                        .addStatement("return this."+name)
                        .build())
                .addMethod(MethodSpec
                        .methodBuilder("set"+upperCas.capitalize(name))
                        .addParameter(String.class, "name")
                        .addModifiers(Modifier.PUBLIC)
                        .addStatement("this."+name+" = name")
                        .build())
                .build();


        JavaFile javaFile = JavaFile.builder("com.gl.sid.entity",person)
                .build();

        String despath="C:/Users/dell/Downloads/demandefra/codeGenerator/src/main/java";
        Path path = Paths.get(despath);

        javaFile.writeTo(path);

    }



}
