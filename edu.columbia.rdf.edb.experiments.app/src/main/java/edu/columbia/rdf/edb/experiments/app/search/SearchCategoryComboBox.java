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
package edu.columbia.rdf.edb.experiments.app.search;

import org.jebtk.modern.combobox.ModernComboBox2;

import edu.columbia.rdf.edb.ui.search.SearchCategory;

/**
 * Specialised combobox for showing selecting search criteria.
 * 
 * @author Antony Holmes
 *
 */
public class SearchCategoryComboBox extends ModernComboBox2 {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /**
   * Instantiates a new search category combo box.
   *
   * @param searchCriteriaPopup the search criteria popup
   * @param field the field
   */
  public SearchCategoryComboBox(SearchCriteriaPopup searchCriteriaPopup,
      SearchCategory field) {
    super.setMenu(searchCriteriaPopup);

    setText(field.getName());
  }
}
