package org.curvedrawer.util;

import java.io.File;
import java.util.List;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Window;

public class RobotPath {

	public static final List<File> retrieveCSVFile(Window owner) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setSelectedExtensionFilter(new ExtensionFilter("CVS Files", "*.cvs"));

		return fileChooser.showOpenMultipleDialog(owner);
	}

}
