-- 25/08/2008 16:00:57
-- 
UPDATE AD_Column SET IsMandatory='Y',Updated=TO_DATE('2008-08-25 16:00:57','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=0 WHERE AD_Column_ID=54742
;

-- 25/08/2008 16:13:53
-- 
ALTER TABLE HR_Employee MODIFY C_BPartner_ID NUMBER(10) DEFAULT  NULL 
;

-- 25/08/2008 16:13:53
-- 
ALTER TABLE HR_Employee MODIFY C_BPartner_ID NOT NULL
;