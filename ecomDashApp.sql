-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: ecomDashApp
-- ------------------------------------------------------
-- Server version	5.7.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `company_revenue`
--

DROP TABLE IF EXISTS `company_revenue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `company_revenue` (
  `pk` varchar(255) NOT NULL,
  `revenue_month` varchar(255) NOT NULL,
  `expense` double DEFAULT NULL,
  `margins` double DEFAULT NULL,
  `revenue` double NOT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company_revenue`
--

LOCK TABLES `company_revenue` WRITE;
/*!40000 ALTER TABLE `company_revenue` DISABLE KEYS */;
INSERT INTO `company_revenue` VALUES ('1','Jan',5000,25000,75000),('2','Feb',6000,27000,80000),('3','Mar',7000,30000,85000),('4','Apr',8000,32000,84000),('5','May',9000,28000,80000),('6','Jun',10000,39000,90000);
/*!40000 ALTER TABLE `company_revenue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_information`
--

DROP TABLE IF EXISTS `employee_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_information` (
  `pk` varchar(255) NOT NULL,
  `_name` varchar(255) DEFAULT NULL,
  `age` int(11) NOT NULL,
  `office_location` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `salary` double NOT NULL,
  `start_date` date DEFAULT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_information`
--

LOCK TABLES `employee_information` WRITE;
/*!40000 ALTER TABLE `employee_information` DISABLE KEYS */;
INSERT INTO `employee_information` VALUES ('3','Ashton Cox',66,'San Francisco','Junior Technical Author',86000,'2009-01-12'),('4','Bradley Greer',41,'London','Software Engineer',132000,'2012-10-13'),('5','Brenden Wagner',28,'San Francisco','Software Engineer',206850,'2011-06-07'),('6','Brielle Williamson',61,'New York','Integration Specialist',372000,'2012-12-02'),('7','Bruno Nash',38,'London','Software Engineer',163500,'2011-05-03'),('8','Caesar Vance',21,'New York','Pre-Sales Support',106450,'2011-12-12'),('9','Cara Stevens',46,'New York','Sales Assistant',145600,'2011-12-06'),('10','Cedric Kelly',22,'Edinburgh','Senior Javascript Developer',433060,'2012-03-29'),('11','Bhupendra',34,'New Jersey','Senior Java Architect',433060,'2013-03-28');
/*!40000 ALTER TABLE `employee_information` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_collection_status`
--

DROP TABLE IF EXISTS `order_collection_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_collection_status` (
  `pk` varchar(255) NOT NULL,
  `new_orders` int(11) NOT NULL,
  `returned` int(11) NOT NULL,
  `revenue` double NOT NULL,
  `shipped` int(11) NOT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_collection_status`
--

LOCK TABLES `order_collection_status` WRITE;
/*!40000 ALTER TABLE `order_collection_status` DISABLE KEYS */;
INSERT INTO `order_collection_status` VALUES ('1',247,15,650000,200);
/*!40000 ALTER TABLE `order_collection_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_recieved`
--

DROP TABLE IF EXISTS `order_recieved`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_recieved` (
  `pk` varchar(255) NOT NULL,
  `date_received` varchar(255) DEFAULT NULL,
  `order_received` int(11) NOT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_recieved`
--

LOCK TABLES `order_recieved` WRITE;
/*!40000 ALTER TABLE `order_recieved` DISABLE KEYS */;
INSERT INTO `order_recieved` VALUES ('1','Mar 1',145),('2','Mar 2',167),('3','Mar 3',167),('4','Mar 4',189),('5','Mar 5',187),('6','Mar 6',133),('8','Mar 7',167),('9','Mar 8',145),('10','Mar 9',154),('11','Mar 10',200);
/*!40000 ALTER TABLE `order_recieved` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_category`
--

DROP TABLE IF EXISTS `product_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_category` (
  `pk` varchar(255) NOT NULL,
  `best_category` bit(1) NOT NULL,
  `category_name` varchar(255) DEFAULT NULL,
  `percentage` int(11) NOT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_category`
--

LOCK TABLES `product_category` WRITE;
/*!40000 ALTER TABLE `product_category` DISABLE KEYS */;
INSERT INTO `product_category` VALUES ('1','','Electronics',12),('2','','Phone/iPad',15),('3','','Purses',11),('4','','Jwellery',8);
/*!40000 ALTER TABLE `product_category` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-12  1:57:29
