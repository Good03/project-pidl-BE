package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackDTO {

     long id;
     String username ;

     String subject;
     String feedbackContent;
     String date;
     String email;
}
