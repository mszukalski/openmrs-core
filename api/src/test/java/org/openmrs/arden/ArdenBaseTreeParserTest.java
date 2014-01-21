/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.arden;

import antlr.CommonAST;
import antlr.RecognitionException;
import antlr.collections.AST;
import org.junit.Assert;
import org.junit.Test;
import org.openmrs.test.Verifies;

/**
 * Contains methods to test behavior of ArdenBaseTreeParser methods
 */
public class ArdenBaseTreeParserTest {
	
	/**
	 * @see {@link ArdenBaseTreeParser#readAST(antlr.collections.AST, MLMObject, String)}
	 */
	@Test
	@Verifies(value = "should only throws RecognitionException", method = "readAST(AST _t, MLMObject obj, String instr)")
	public void readAST_shouldOnlyThrowsRecognitionException() {

        ArdenBaseTreeParser ardenBaseTreeParser = new ArdenBaseTreeParser();
		AST _t = null;
		MLMObject obj = null;
		String instr = null;
		
		try {
			ardenBaseTreeParser.readAST(_t, obj, instr);
		}
		catch (Exception e) {
			Assert.assertTrue(e instanceof RecognitionException);
		}
	}
}
