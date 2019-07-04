/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.songkhla.wordgen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Computer
 */
public class DateLabelFormatter  extends JFormattedTextField.AbstractFormatter {

	    private String datePattern = "dd/MM/yyyy";
	    private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

	    @Override
	    public Object stringToValue(String text) throws ParseException {
	    	try {
		    	String[] text_split = text.split("/");
		    	int year = Integer.parseInt(text_split[2]);
		    	year-=543;
//                        TimeZone timeZone = TimeZone.getTimeZone("UTC");
		    	             Calendar cal = Calendar.getInstance();
		    	cal.setTime((java.util.Date)dateFormatter.parseObject(text_split[0]+"/"+text_split[1]+"/"+year));
		        return cal;
	    	}catch(Exception ex) {
	    		             JOptionPane.showMessageDialog(null, "Date Format Error!! using dd/MM/yyyy");
	    		return null;
	    	}
	    }

	    @Override
	    public String valueToString(Object value) throws ParseException {
	        if (value != null) {
	            Calendar cal = (Calendar) value;
	            String text_tmp = dateFormatter.format(cal.getTime());
	            String[] text_split = text_tmp.split("/");
		    	int year = Integer.parseInt(text_split[2]);
		    	year+=543;
	            return text_split[0]+"/"+text_split[1]+"/"+year;
	        }
	        return "";
	    }
	}