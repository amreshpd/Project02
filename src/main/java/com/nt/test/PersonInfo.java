package com.nt.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
@PropertySource(value="com/nt/common/info.properties")
public class PersonInfo {
   @Value("${per.id}")
  private Integer pId;
   
   @Value("${per.name}")
   private String pName;

@Override
public String toString() {
	return "PersonInfo [pId=" + pId +" P name: "+pName+ "]";
   }   
}
