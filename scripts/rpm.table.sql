
  CREATE TABLE "RPM"."BASE_MANAGE" 
   (	"BASE_ID" NUMBER NOT NULL ENABLE, 
	"BASE_NAME" VARCHAR2(128 BYTE) NOT NULL ENABLE, 
	"DEPARTMENT_ID" NUMBER NOT NULL ENABLE, 
	 CONSTRAINT "BASE_MANAGE_PK" PRIMARY KEY ("BASE_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
 

  CREATE TABLE "RPM"."BRANCH_CARD_MANAGE" 
   (	"BRANCH_CARD_ID" NUMBER NOT NULL ENABLE, 
	"TOTAL_CARD_ID" NUMBER NOT NULL ENABLE, 
	"CONTENT" VARCHAR2(256 BYTE) NOT NULL ENABLE, 
	"MONEY_USET_ID" VARCHAR2(20 BYTE) NOT NULL ENABLE, 
	"MONEY_GET_DATE" DATE NOT NULL ENABLE, 
	"NOTE" VARCHAR2(256 BYTE), 
	 CONSTRAINT "BRANCH_CARD_MANAGE_PK" PRIMARY KEY ("BRANCH_CARD_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
 

  CREATE TABLE "RPM"."DEPARTMENT_MANAGE" 
   (	"DEPARTMENT_ID" NUMBER NOT NULL ENABLE, 
	"DEPARTMENT_NAME" VARCHAR2(128 BYTE) NOT NULL ENABLE, 
	"MANAGER_ID" NUMBER NOT NULL ENABLE, 
	"PROJECT_ID" NUMBER NOT NULL ENABLE, 
	"NOTE" VARCHAR2(256 BYTE), 
	 CONSTRAINT "DEPARTMENT_MANAGE_PK" PRIMARY KEY ("DEPARTMENT_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
 

  CREATE TABLE "RPM"."INTELLECTUAL_PROPERTY_RIGHTS" 
   (	"PROPERTY_RIGHTS_ID" NUMBER NOT NULL ENABLE, 
	"PROPERTY_RIGHTS_NAME" VARCHAR2(128 BYTE) NOT NULL ENABLE, 
	"ACHIEVEMENT_ID" NUMBER NOT NULL ENABLE, 
	"EXPENSE" NUMBER, 
	"NOTE" VARCHAR2(256 BYTE), 
	 CONSTRAINT "INTELLECTUAL_PROPERTY_RIG_PK" PRIMARY KEY ("PROPERTY_RIGHTS_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
 

  CREATE TABLE "RPM"."PAPER_MANAGE" 
   (	"PAPER_ID" NUMBER NOT NULL ENABLE, 
	"PAPER_NAME" VARCHAR2(128 BYTE) NOT NULL ENABLE, 
	"PROJECT_ID" NUMBER NOT NULL ENABLE, 
	"PAPER_AUTHOR" NUMBER NOT NULL ENABLE, 
	"PAPER_ATTRIBUTE" NUMBER, 
	"NOTE" VARCHAR2(256 BYTE), 
	 CONSTRAINT "PAPER_MANAGE_PK" PRIMARY KEY ("PAPER_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
 

  CREATE TABLE "RPM"."RECREATIONAL_ACTIVITES" 
   (	"PECREATIONAL_ID" NUMBER NOT NULL ENABLE, 
	"RECREATIONAL_NAME" VARCHAR2(128 BYTE) NOT NULL ENABLE, 
	"PROJECT_ID" NUMBER NOT NULL ENABLE, 
	"RECREATIONAL_ATTRIBUTE" NUMBER NOT NULL ENABLE, 
	"ACTIVITIES_DATE" DATE NOT NULL ENABLE, 
	"ACTIVITIES_PLACE" VARCHAR2(128 BYTE) NOT NULL ENABLE, 
	"NOTE" VARCHAR2(256 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
 

  CREATE TABLE "RPM"."SCIENTIFIC_RESARCH_ACHIEVEMENT" 
   (	"ACHIEVEMENT_ID" NUMBER NOT NULL ENABLE, 
	"ACHIEVEMENT_NAME" VARCHAR2(128 BYTE) NOT NULL ENABLE, 
	"PROJECT_ID" NUMBER NOT NULL ENABLE, 
	"APPRAISAL" NUMBER NOT NULL ENABLE, 
	"APPRAISAL_EXPERT_IMFORMATION" VARCHAR2(256 BYTE) NOT NULL ENABLE, 
	"PRIZE" VARCHAR2(256 BYTE), 
	"NOTE" VARCHAR2(256 BYTE), 
	 CONSTRAINT "SCIENTIFIC_RESARCH_ACHIEV_PK" PRIMARY KEY ("ACHIEVEMENT_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
 

  CREATE TABLE "RPM"."SCIENTIFIC_RESEARC_PROJECT" 
   (	"PROJECT_ID" NUMBER NOT NULL ENABLE, 
	"PROJECT_NAME" VARCHAR2(128 BYTE) NOT NULL ENABLE, 
	"PROJECT_FUND" NUMBER NOT NULL ENABLE, 
	"PROJECT_ATTRIBUTE" NUMBER NOT NULL ENABLE, 
	"FUND_ORIGIN" VARCHAR2(256 BYTE) NOT NULL ENABLE, 
	"PROJECT_CLASS" VARCHAR2(128 BYTE) NOT NULL ENABLE, 
	"CONTRACT_FUND" NUMBER NOT NULL ENABLE, 
	"NOTE" VARCHAR2(256 BYTE), 
	 CONSTRAINT "SCIENTIFIC_RESEARC_PROJEC_PK" PRIMARY KEY ("PROJECT_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
 

  CREATE TABLE "RPM"."TOTAL_CARD_MANAGE" 
   (	"CARD_ID" NUMBER NOT NULL ENABLE, 
	"PROJECT_ID" NUMBER NOT NULL ENABLE, 
	"INCLUSION_FUND" NUMBER, 
	"CARD_ATTRIBUTE" NUMBER NOT NULL ENABLE, 
	"NOTE" VARCHAR2(256 BYTE), 
	 CONSTRAINT "TOTAL_CARD_MANAGE_PK" PRIMARY KEY ("CARD_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
 

  CREATE TABLE "RPM"."USER_MANAGE" 
   (	"USERID" NUMBER NOT NULL ENABLE, 
	"PASSWORD" VARCHAR2(128 BYTE) NOT NULL ENABLE, 
	"USER_NAME" VARCHAR2(128 BYTE) NOT NULL ENABLE, 
	"DEPARTMENT_ID" NUMBER NOT NULL ENABLE, 
	"PERMISSION" NUMBER NOT NULL ENABLE, 
	"PROJECT_ID" NUMBER NOT NULL ENABLE, 
	"NOTE" VARCHAR2(256 BYTE), 
	 CONSTRAINT "USER_MANAGER_PK" PRIMARY KEY ("USERID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
  
CREATE TABLE "RPM"."PROJECT_MEMBER" 
   (	"PROJECT_ID" NUMBER NOT NULL ENABLE, 
	"MEMBER" VARCHAR2(20 BYTE), 
	"ID" NUMBER NOT NULL ENABLE, 
	 CONSTRAINT "PROJECT_MEMBER_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;