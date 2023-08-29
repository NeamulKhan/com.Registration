Feature: this feature is for user registration

@Registration1

Scenario: verify user can successfully register

Given Launch "<URL>"
Then enter firstname,lastname,address,email and phone number
Then click gender,hobbies,languages, select skills,country and county, date of birth, confirm dob and click submit button
Then click submit button 