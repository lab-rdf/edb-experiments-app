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
package edu.columbia.rdf.edb.experiments.app.plugins.view.rnaseq;

import org.jebtk.core.path.Path;

import edu.columbia.rdf.edb.ui.sort.SortSamplesByTag;

// TODO: Auto-generated Javadoc
/**
 * The Class SortSamplesByRnaSeqField.
 */
public abstract class SortSamplesByRnaSeqField extends SortSamplesByTag {
	
	/**
	 * Instantiates a new sort samples by rna seq field.
	 *
	 * @param path the path
	 */
	public SortSamplesByRnaSeqField(String path) {
		this(new Path(path));
	}
	
	/**
	 * Instantiates a new sort samples by rna seq field.
	 *
	 * @param path the path
	 */
	public SortSamplesByRnaSeqField(Path path) {
		super(path);
	}

	/* (non-Javadoc)
	 * @see edu.columbia.rdf.edb.ui.sort.SampleSorter#getType()
	 */
	@Override
	public String getType() {
		return "RNA-seq properties";
	}
}