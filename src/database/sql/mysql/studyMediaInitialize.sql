-- -----------------------------------------------------
-- Table `studyMedia`.`Type`
-- -----------------------------------------------------
INSERT INTO `studymedia`.`TYPE`
            (name,
             description)
VALUES      ('Video',
             'Streaming Video');

INSERT INTO `studymedia`.`TYPE`
            (name,
             description)
VALUES      ('Application',
             'Mobile Application');

INSERT INTO `studymedia`.`TYPE`
            (name,
             description)
VALUES      ('Document',
             'File Document'); 



-- -----------------------------------------------------
-- Table `studyMedia`.`SubType`
-- -----------------------------------------------------
INSERT INTO `studymedia`.`SUBTYPE`
            (type_typeid,
             name,
             description)
VALUES      ((SELECT typeid
              FROM   `studymedia`.`TYPE`
              WHERE  name = 'Video'),
             'Trailer',
             'Free Trailer');

INSERT INTO `studymedia`.`SUBTYPE`
            (type_typeid,
             name,
             description)
VALUES      ((SELECT typeid
              FROM   `studymedia`.`TYPE`
              WHERE  name = 'Video'),
             'Tutorial',
             'Paid Tutorial' );

INSERT INTO `studymedia`.`SUBTYPE`
            (type_typeid,
             name,
             description)
VALUES      ((SELECT typeid
              FROM   `studymedia`.`TYPE`
              WHERE  name = 'Application'),
             'iOS',
             'Apple Mobile' );

INSERT INTO `studymedia`.`SUBTYPE`
            (type_typeid,
             name,
             description)
VALUES      ((SELECT typeid
              FROM   `studymedia`.`TYPE`
              WHERE  name = 'Application'),
             'Android',
             'Google Mobile' );

INSERT INTO `studymedia`.`SUBTYPE`
            (type_typeid,
             name,
             description)
VALUES      ((SELECT typeid
              FROM   `studymedia`.`TYPE`
              WHERE  name = 'Document'),
             'White Paper',
             'White Paper' ); 



-- -----------------------------------------------------
-- Table `studyMedia`.`Category`
-- -----------------------------------------------------
INSERT INTO `studymedia`.`CATEGORY`
            (name,
             description)
VALUES      ('Adult',
             'Adult Learning Resources');

INSERT INTO `studymedia`.`CATEGORY`
            (name,
             description)
VALUES      ('Teenage',
             'Teenage Learning Resources');

INSERT INTO `studymedia`.`CATEGORY`
            (name,
             description)
VALUES      ('Child',
             'Child Learning Resources'); 


-- -----------------------------------------------------
-- Table `studyMedia`.`Resource`
-- -----------------------------------------------------
INSERT INTO `studymedia`.`RESOURCE`
            (category_categoryid,
             name,
             description)
VALUES      ( (SELECT categoryid
               FROM   `studymedia`.`CATEGORY`
               WHERE  name = 'Child'),
              'Geography',
              'Geography, techtonic plates, continents and countries.');
              
              
INSERT INTO `studymedia`.`RESOURCE`
            (category_categoryid,
             name,
             description)
VALUES      ( (SELECT categoryid
               FROM   `studymedia`.`CATEGORY`
               WHERE  name = 'Child'),
              'Time',
              'Time, how to tell time, introduction to digital and analog clocks.');

              
INSERT INTO `studymedia`.`RESOURCE`
            (category_categoryid,
             name,
             description)
VALUES      ( (SELECT categoryid
               FROM   `studymedia`.`CATEGORY`
               WHERE  name = 'Child'),
              'Color',
              'Color, Physics of color, mixing and matching colors.');
              
              
INSERT INTO `studymedia`.`RESOURCE`
            (category_categoryid,
             name,
             description)
VALUES      ( (SELECT categoryid
               FROM   `studymedia`.`CATEGORY`
               WHERE  name = 'Adult'),
              'Cancer',
              'Cancer, Theory and alternative treatments - including DCA.');
              
              
INSERT INTO `studymedia`.`RESOURCE`
            (category_categoryid,
             name,
             description)
VALUES      ( (SELECT categoryid
               FROM   `studymedia`.`CATEGORY`
               WHERE  name = 'Adult'),
              'Cholesterol',
              'Cholesterol, Misconceptions and simple truths.');

              
INSERT INTO `studymedia`.`RESOURCE`
            (category_categoryid,
             name,
             description)
VALUES      ( (SELECT categoryid
               FROM   `studymedia`.`CATEGORY`
               WHERE  name = 'Adult'),
              'Vitamin D',
              'Vitamin D, Misconceptions and simple truths.');
              
              
INSERT INTO `studymedia`.`RESOURCE`
            (category_categoryid,
             name,
             description)
VALUES      ( (SELECT categoryid
               FROM   `studymedia`.`CATEGORY`
               WHERE  name = 'Teenage'),
              'Manage Time',
              'How to manage Time.');

              
INSERT INTO `studymedia`.`RESOURCE`
            (category_categoryid,
             name,
             description)
VALUES      ( (SELECT categoryid
               FROM   `studymedia`.`CATEGORY`
               WHERE  name = 'Teenage'),
              'Manage Life',
              'How to manage your Life.');
              
              
INSERT INTO `studymedia`.`RESOURCE`
            (category_categoryid,
             name,
             description)
VALUES      ( (SELECT categoryid
               FROM   `studymedia`.`CATEGORY`
               WHERE  name = 'Teenage'),
              'Manage Health',
              'How to manage Stress, Health.');
              

              
-- -----------------------------------------------------
-- Table `studyMedia`.`Material` - Geography
-- -----------------------------------------------------
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Geography'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Trailer'),
               'http://test.com',
              'Geography - Video - Trailer',
              'Geography, techtonic plates, continents and countries.'); 

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Geography'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Tutorial'),
               'http://test.com',
              'Geography - Video - Tutorial',
              'Geography, techtonic plates, continents and countries.'); 
              
              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Geography'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'iOS'),
               'http://test.com',
              'Geography - Application - iOS',
              'Geography, techtonic plates, continents and countries.'); 

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Geography'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Android'),
               'http://test.com',
              'Geography - Application - Android',
              'Geography, techtonic plates, continents and countries.'); 



              
-- -----------------------------------------------------
-- Table `studyMedia`.`Material` - Time
-- -----------------------------------------------------
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Time'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Trailer'),
               'http://test.com',
              'Time - Video - Trailer',
              'Time, how to tell time, introduction to digital and analog clocks.'); 

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Time'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Tutorial'),
               'http://test.com',
              'Time - Video - Tutorial',
              'Time, how to tell time, introduction to digital and analog clocks.'); 
              
              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Time'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'iOS'),
               'http://test.com',
              'Time - Application - iOS',
              'Time, how to tell time, introduction to digital and analog clocks.'); 

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Time'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Android'),
               'http://test.com',
              'Time - Application - Android',
              'Time, how to tell time, introduction to digital and analog clocks.'); 

              
              
-- -----------------------------------------------------
-- Table `studyMedia`.`Material` - Color
-- -----------------------------------------------------
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Color'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Trailer'),
               'http://test.com',
              'Color - Video - Trailer',
              'Color, Physics of color, mixing and matching colors.'); 

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Color'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Tutorial'),
               'http://test.com',
              'Color - Video - Tutorial',
              'Color, Physics of color, mixing and matching colors.'); 
              
              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Color'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'iOS'),
               'http://test.com',
              'Color - Application - iOS',
              'Color, Physics of color, mixing and matching colors.'); 

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Color'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Android'),
               'http://test.com',
              'Color - Application - Android',
              'Color, Physics of color, mixing and matching colors.'); 

              
              
-- -----------------------------------------------------
-- Table `studyMedia`.`Material` - Cancer
-- -----------------------------------------------------
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Cancer'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Trailer'),
               'http://test.com',
              'Cancer - Video - Trailer',
              'Cancer, Theory and alternative treatments - including DCA.'); 

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Cancer'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Tutorial'),
               'http://test.com',
              'Cancer - Video - Tutorial',
              'Cancer, Theory and alternative treatments - including DCA.'); 
              
              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Cancer'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'iOS'),
               'http://test.com',
              'Cancer - Application - iOS',
              'Cancer, Theory and alternative treatments - including DCA.'); 

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Cancer'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Android'),
               'http://test.com',
              'Cancer - Application - Android',
              'Cancer, Theory and alternative treatments - including DCA.'); 
              
              
              
-- -----------------------------------------------------
-- Table `studyMedia`.`Material` - Cholesterol
-- -----------------------------------------------------
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Cholesterol'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Trailer'),
               'http://test.com',
              'Cholesterol - Video - Trailer',
              'Cholesterol, Misconceptions and simple truths.'); 

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Cholesterol'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Tutorial'),
               'http://test.com',
              'Cholesterol - Video - Tutorial',
              'Cholesterol, Misconceptions and simple truths.'); 
              
              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Cholesterol'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'iOS'),
               'http://test.com',
              'Cholesterol - Application - iOS',
              'Cholesterol, Misconceptions and simple truths.');

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Cholesterol'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Android'),
               'http://test.com',
              'Cholesterol - Application - Android',
              'Cholesterol, Misconceptions and simple truths.');
              
              
              
-- -----------------------------------------------------
-- Table `studyMedia`.`Material` - Vitamin D
-- -----------------------------------------------------
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Vitamin D'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Trailer'),
               'http://test.com',
              'Vitamin D - Video - Trailer',
              'Vitamin D, Misconceptions and simple truths.'); 

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Vitamin D'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Tutorial'),
               'http://test.com',
              'Vitamin D - Video - Tutorial',
              'Vitamin D, Misconceptions and simple truths.'); 
              
              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Vitamin D'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'iOS'),
               'http://test.com',
              'Vitamin D - Application - iOS',
              'Vitamin D, Misconceptions and simple truths.'); 

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Vitamin D'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Android'),
               'http://test.com',
              'Vitamin D - Application - Android',
              'Vitamin D, Misconceptions and simple truths.'); 
              
              
-- -----------------------------------------------------
-- Table `studyMedia`.`Material` - Manage Time
-- -----------------------------------------------------
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Manage Time'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Trailer'),
               'http://test.com',
              'Manage Time - Video - Trailer',
              'How to manage Time.'); 

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Manage Time'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Tutorial'),
               'http://test.com',
              'Manage Time - Video - Tutorial',
              'How to manage Time.');  
              
              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Manage Time'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'iOS'),
               'http://test.com',
              'Manage Time - Application - iOS',
              'How to manage Time.');  

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Manage Time'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Android'),
               'http://test.com',
              'Manage Time - Application - Android',
              'How to manage Time.'); 
              

              
-- -----------------------------------------------------
-- Table `studyMedia`.`Material` - Manage Life
-- -----------------------------------------------------
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Manage Life'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Trailer'),
               'http://test.com',
              'Manage Life - Video - Trailer',
              'How to manage your Life.'); 

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Manage Life'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Tutorial'),
               'http://test.com',
              'Manage Life - Video - Tutorial',
              'How to manage your Life.');   
              
              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Manage Life'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'iOS'),
               'http://test.com',
              'Manage Life - Application - iOS',
              'How to manage your Life.');  

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Manage Life'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Android'),
               'http://test.com',
              'Manage Life - Application - Android',
              'How to manage your Life.'); 
              

-- -----------------------------------------------------
-- Table `studyMedia`.`Material` - Manage Health
-- -----------------------------------------------------
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Manage Health'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Trailer'),
               'http://test.com',
              'Manage Health - Video - Trailer',
              'How to manage Stress, Health.'); 

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Manage Health'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Video'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Tutorial'),
               'http://test.com',
              'Manage Health - Video - Tutorial',
              'How to manage Stress, Health.');   
              
              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Manage Health'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'iOS'),
               'http://test.com',
              'Manage Health - Application - iOS',
              'How to manage Stress, Health.');  

              
INSERT INTO `studymedia`.`MATERIAL`
            (resource_resourceid,
             type_typeid,
             subtype_subtypeid,
             url,
             name,
             description)
VALUES      ( (SELECT resourceid
               FROM   `studymedia`.`RESOURCE`
               WHERE  name = 'Manage Health'),
              (SELECT typeid
               FROM   `studymedia`.`TYPE`
               WHERE  name = 'Application'),
              (SELECT subtypeid
               FROM   `studymedia`.`SUBTYPE`
               WHERE  name = 'Android'),
               'http://test.com',
              'Manage Health - Application - Android',
              'How to manage Stress, Health.');
              
              
-- -----------------------------------------------------
-- Table `studyMedia`.`User`
-- -----------------------------------------------------
INSERT INTO `studymedia`.`USER`
            (role,
             login,
             password,
             firstname,
             lastname,
             emails,
             country,
             state,
             city,
             address,
             code,
             phones)
VALUES     ( 'Admin',
             'frankmisa@hotmail.com',
             'password',
             'TestUserFirstName',
             'TestUserLastName',
             'frankmisa@hotmail.com, misafrank@gmail.com',
             'Canada',
             'Ontario',
             'Oakville',
             '372 Cairns Valley Crt.',
             'L6J6L3',
             '416 721-3466');