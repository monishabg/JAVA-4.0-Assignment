package com.factory.factories;

import com.factory.documents.Document;
import com.factory.documents.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {

	@Override
	public Document createDocument() {
		// TODO Auto-generated method stub
		return new ExcelDocument();
	}

}
