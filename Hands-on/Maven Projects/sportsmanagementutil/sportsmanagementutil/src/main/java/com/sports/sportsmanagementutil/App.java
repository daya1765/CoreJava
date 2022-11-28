package com.sports.sportsmanagementutil;

import java.util.List;

import com.dao.CricketDao;
import com.entity.Cricket;
import com.entity.CricketDetail;

public class App 
{
	 public static void main( String[] args )
	    {
	        // Save two instructors
	        Cricket instructor = new Cricket("Virat Kohli", "WAtching TV", "Ronaldo");
	        CricketDetail instructorDetail = new CricketDetail("Jawaharlal nehru", "World cup");
	        instructorDetail.setCricket(instructor);
	        instructor.setCricketDetail(instructorDetail);
	       
	        Cricket instructor1 = new Cricket("Sachin Tendulkar", "Reading books", "Amitabh Bachchan");
	        CricketDetail instructorDetail1 = new CricketDetail("Eden Garden", "T20");
	        instructorDetail1.setCricket(instructor1);
	        instructor1.setCricketDetail(instructorDetail1);
	       
	        CricketDao instructorDao = new CricketDao();
	        instructorDao.saveCricket(instructor);
	        instructorDao.saveCricket(instructor1);
	       
	        // Get all instructors
	        List<Cricket> instructors = instructorDao.getAllInstructor();
	        instructors.forEach(instructorTemp -> System.out.println(instructorTemp.getPlayerName()));
	    }
	 
}
