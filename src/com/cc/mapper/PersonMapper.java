package com.cc.mapper;

import com.cc.po.Person;
import org.junit.internal.Classes;

//通过id查人
public interface PersonMapper {
   Person findPersonById(Integer id);
}
