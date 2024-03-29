package com.collection.comparator;

import java.util.Comparator;

import com.collection.model.Student;

public class StundentAgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getAge() == s2.getAge())
			return 0;
		else if (s1.getAge() > s2.getAge())
			return 1;
		else
			return -1;
	}

}
