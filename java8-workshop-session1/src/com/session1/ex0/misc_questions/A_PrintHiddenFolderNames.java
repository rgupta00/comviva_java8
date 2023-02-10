package com.session1.ex0.misc_questions;

import java.io.File;
import java.io.FileFilter;

public class A_PrintHiddenFolderNames {

	public static void main(String[] args) {
		// Give me details of all hidden file in a dir

		File myDir = new File("\\user\\admin\\deploy");
		if (myDir.isDirectory()) {
			File[] files = myDir.listFiles(new FileFilter() {
				public boolean accept(File f) {
					return f.isFile();
				}
			});
		}

	}
}
