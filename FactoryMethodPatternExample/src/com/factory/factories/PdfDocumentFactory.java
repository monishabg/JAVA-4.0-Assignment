package com.factory.factories;

import com.factory.documents.Document;
import com.factory.documents.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {

	@Override
	public Document createDocument() {
		// TODO Auto-generated method stub
		return new PdfDocument();
	}

}
