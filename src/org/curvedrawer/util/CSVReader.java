package org.curvedrawer.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CSVReader {

	private List<List<String>> stringArrayList = new ArrayList<>();

	public CSVReader(File csvFile) throws IOException {
		retrieveData(Files.newBufferedReader(csvFile.toPath()));
	}

	private void retrieveData(BufferedReader reader) {
		stringArrayList = reader.lines().map(line -> Arrays.asList(line.split(" ")))
			.collect(Collectors.toList());
	}

	public int getNumRows() {
		return stringArrayList.size();
	}

	public int getNumCols() {
		return stringArrayList.get(0).size();
	}
}
