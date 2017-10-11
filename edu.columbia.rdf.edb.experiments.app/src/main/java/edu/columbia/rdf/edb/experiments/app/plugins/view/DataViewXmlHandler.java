/**
 * Copyright 2017 Antony Holmes
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.columbia.rdf.edb.experiments.app.plugins.view;

import org.jebtk.core.path.Path;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import edu.columbia.rdf.edb.DataView;
import edu.columbia.rdf.edb.DataViewSection;

// TODO: Auto-generated Javadoc
/**
 * The Class SearchFolderXmlHandler.
 */
public class DataViewXmlHandler extends DefaultHandler {
	
	/** The m folder stack. */
	private DataView mDataView;
	private DataViewSection mSection;
	
	public DataViewXmlHandler(DataView dataView) {
		mDataView = dataView;
	}
	
	/* (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	@Override
	public final void startElement(String uri,
    		String localName,
    		String qName,
    		Attributes attributes) throws SAXException {

		if (qName.equals("view")) {
			//mDataView = new DataView(attributes.getValue("name"));
		} else if (qName.equals("section")) {
			mSection = new DataViewSection("Source");
			
			mDataView.addSection(mSection);
		} else if (qName.equals("field")) {
			mSection.addField(Path.create(attributes.getValue("path")), attributes.getValue("name"));
    	} else {
    		// do nothing
    	}
	}
	
    /**
	 * Gets the search folders.
	 *
	 * @return the search folders
	 */
	public DataView getDataView() {
    	return mDataView;
    }
}
