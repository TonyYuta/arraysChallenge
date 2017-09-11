/**
 *   File Name: TestDataIF.java<br>
 *
 *   Yutaka<br>
 *   Created: Aug 29, 2017
 *   
 */

package org.coding.arraysChallenge;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * TestDataIF 
 * Interface for Data Provider
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface TestDataIF {
	int id() default 0;
}
