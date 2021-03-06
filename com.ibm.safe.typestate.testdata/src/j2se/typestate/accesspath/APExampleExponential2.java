/*******************************************************************************
 * Copyright (c) 2004-2010 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/*********************************************************************
 * Name: APExampleExponential2.java
 * Author: Eran Yahav (eyahav)
 *
 * A variant of APExample2, designed to make the AP engine exhibit exponential blowup.
 * x_1...x_k (for some k) may be pointing to a file component.
 *
 * Expected Result: In this case, no error should be reported.
 *                  The cost of analysis, is however exponential in k.
 *
 *********************************************************************/

package j2se.typestate.accesspath;

import j2se.typestate.fileComponent.FileComponent;

import java.util.Random;

public class APExampleExponential2 {

  static Random r = new Random();

  static int aNumber = r.nextInt();

  static FileComponent x_1 = null;

  static FileComponent x_2 = null;

  static FileComponent x_3 = null;

  static FileComponent x_4 = null;

  static FileComponent x_5 = null;

  static FileComponent x_6 = null;

  public static void main(String[] args) {
    FileComponent f1 = new FileComponent(); // FileComponent Site #1

    if (aNumber > 1) {
      x_1 = f1;
    }
    if (aNumber > 2) {
      x_2 = f1;
    }
    if (aNumber > 3) {
      x_3 = f1;
    }
    if (aNumber > 4) {
      x_4 = f1;
    }
    if (aNumber > 1) {
      x_5 = f1;
    }
    if (aNumber > 1) {
      x_6 = f1;
    }

    f1.read();
    f1.close();
  }
}
