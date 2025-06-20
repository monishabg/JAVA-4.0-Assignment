package com.factory.factories;

import com.factory.documents.Document;
import com.factory.documents.WordDocument;

public class WordDocumentFactory extends DocumentFactory {

	@Override
	public Document createDocument() {
		// TODO Auto-generated method stub
		return new WordDocument();
	}

}
