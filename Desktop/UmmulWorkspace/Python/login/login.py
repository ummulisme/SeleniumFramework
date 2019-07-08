from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import os
user ="Admin_QA"
pwd="i3systems"
driver = webdriver.Chrome("C:/Users/umul/Downloads/Farah/chromedriver.exe")
driver.get("http://132.145.162.169/")
elem = driver.find_element_by_id("id_username")
elem.send_keys(user)
elem = driver.find_element_by_id("id_password")
elem.send_keys(pwd)
elem.send_keys(Keys.RETURN)
'''Upload_button = driver.find_element_by_xpath("/html/body/div[2]/div/div[1]/div[2]/button").click()'''
driver.find_element_by_xpath("//input[@type='file']").send_keys(r'''C:\Users\umul\Pictures\test231.jpg''')
'''driver.close()'''