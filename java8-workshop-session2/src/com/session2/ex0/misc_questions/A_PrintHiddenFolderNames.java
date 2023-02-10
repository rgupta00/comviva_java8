package com.session2.ex0.misc_questions;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class A_PrintHiddenFolderNames {

	public static void main(String[] args) {
		// Give me details of all hidden file in a dir

		File myDir = new File("/home/raj/Desktop/tools/sts-bundle");
		if (myDir.isDirectory()) {
			File[] files = myDir.listFiles( File::isHidden);
			
			Arrays.asList(files).stream().forEach(f-> System.out.println(f.getName()));
			
		}

		System.out.println("------");
	}
}
