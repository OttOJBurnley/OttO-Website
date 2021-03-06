/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.communispace.otto.web.model;

import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author GBarnett
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NUnitResult {
	public String Name;
	public boolean Executed;
	public List<String> Categories;
	public boolean IsSuccess;
	public boolean IsFailure;
	public double Time;
	public String Message;
	public String StackTrace;
	public String Description;
	public String Browser;
}
