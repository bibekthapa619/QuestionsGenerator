-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 25, 2018 at 04:01 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qp`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `name` varchar(10) NOT NULL,
  `password` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`name`, `password`) VALUES
('admin', 'F865B53623B121FD34EE5426C792E5C33AF8C227');

-- --------------------------------------------------------

--
-- Table structure for table `dsa`
--

CREATE TABLE `dsa` (
  `ID` int(11) NOT NULL,
  `questionnum` varchar(3) DEFAULT NULL,
  `question` varchar(600) DEFAULT NULL,
  `weightage` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `fit`
--

CREATE TABLE `fit` (
  `ID` int(11) NOT NULL,
  `questionnum` varchar(3) DEFAULT NULL,
  `question` varchar(600) DEFAULT NULL,
  `weightage` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fit`
--

INSERT INTO `fit` (`ID`, `questionnum`, `question`, `weightage`) VALUES
(1, '1a', 'tftygy', 7);

-- --------------------------------------------------------

--
-- Table structure for table `phy`
--

CREATE TABLE `phy` (
  `ID` int(11) NOT NULL,
  `questionnum` varchar(3) DEFAULT NULL,
  `question` varchar(600) DEFAULT NULL,
  `weightage` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sef`
--

CREATE TABLE `sef` (
  `ID` int(11) NOT NULL,
  `questionnum` varchar(3) DEFAULT NULL,
  `question` varchar(600) DEFAULT NULL,
  `weightage` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sef`
--

INSERT INTO `sef` (`ID`, `questionnum`, `question`, `weightage`) VALUES
(1, '1b', 'With the given data for an online shopping site \ndeveloped by ABC software developers,\n  Number of User Input	:	98\n  Number of User Output	:	51\n  Number of User Inquiries	:	47\n  Number of External Interfaces	:	32\n  Number of Logical Files	:	61\nAssuming that the complexity of the given website development\nis average,compute the function point,if the productivity of the\nABC S/W developers is 35 FP/P-M, and their salary structure\nis Rs.15000 per  month on average,estimate total cost of the\nsoftware.', 8),
(15, '1a', 'Can evolutionary model be satisfactory used for \ndevelopment of all types of project? Describe the \nphases of evolutionary model.', 7),
(16, '1a', 'Why do you need a process model to be followed \nin order to develop software?Explain spiral model.', 7),
(17, '1a', 'What is software process?Explain Spiral model with\ndiagram,stating its advantages and disadvantages.', 7),
(18, '1a', 'What is software process model?Explain incremental\nModel with diagram.', 7),
(20, '2a', 'Why is it necessary to do software project planning?\nWhat are the different types of software risks?Explain.', 7),
(21, '1b', 'Compute the function point value for a project with the\nfollowing information domain characteristics.\nNumber of User Input	:	32\nNumber of User Output	:	60\nNumber of User Inquiries	:	24\nNumber of files		:	8\nNumber of external interface	:	2', 8),
(22, '1b', 'How software metrics does helps in enhancing software quality.\nA MIS system for the college is to be developed in which the\nestimated lines of codes(LOC) is calculated to be 45,000 and a\nreview of the historical data reveals that thr labor rate is Rs.6,500\nper month.What would be the estimated project cost and the \nestimated effort for this software package?\n', 8),
(24, '2a', '"If you do not actively attack the risk, the risk will attack\nyou",Justify your statement. Differentiate between \npredictable and unpredictable risks.', 8),
(25, '2a', 'Define Risk Projection. Describe different risk categories\nto be considered during software development.', 7),
(26, '2a', 'What are various kinds of software risks? Discuss risk\nmitigation strategies.\n', 8),
(27, '2b', 'What are the quality factors that contributes to quality\nsoftware? Explain Software Quality Assurance(SQA)\nactivities.', 8),
(28, '1b', 'What is indirect measure and why are such measures\ncommon in software metric work? Compute the function\npoint value for a project with the following domain \ncharacterstics.\nNumber of User Input	:	39\nNumber of User Output	:	53\nNumber of User Inquiries	:	30\nNumber of files		:	12\nNumber of external interface	:	5\n    ', 8),
(29, '2b', 'What is SQA needed?Elaborate the Activities of SQA group.', 7),
(30, '2b', 'Describe cost of quality. Discuss how SQA activities are\ncarried out to help software quality.', 8),
(31, '2b', 'What is the purposse of clean room engineering in software\nquality assurance? Explain in detail.', 7),
(33, '3a', '"Quality and Reliability are related concepts but are \nfundamentally different". Justify this statement with a \nsuitable example.', 7),
(34, '3a', ' What do you mean by Quality of Conformance and Quality\nof Design? Explain about the important guidelines for\nconducting FTR?', 8),
(35, '3a', 'How do you perforn Formal Technical Review?', 7),
(36, '3a', 'What is FTR? Why is it important? What are the guideline for conducting\nFTR?', 8),
(37, '3b', 'What is software configuration management? Describe \nthe change control process in brief.', 7),
(38, '3b', 'What do you mean by version control? Why is configuration audit \nessential during sofware development process?', 7),
(39, '3b', 'What do you understand by the term SCM? Which \ncomponents of software can undergo configuration \nmanagement? What is the role of baseline and SCIs\nin SCM process? Explain with necessary figure.', 8),
(40, '3b', 'What is SCM? What is its relation with change control\nprocess? Explain all steps involved in change control.', 8),
(41, '4a', 'Why is Software Designing an important job? Explain\nModularity Concept along with the five criteria for effective\nmodular system.', 8),
(42, '4a', '"Analysis starts with modeling",Elaborate. Describe the concept of\ndata modeling.', 7),
(43, '4a', 'Why is software design important? State the design\nprinciples of software design.', 7),
(44, '4a', 'What is the importance of software design? Explain \nModularity, Control Hierarchy,and Information Hiding\nin design concept.', 8),
(45, '4a', 'What is software design? Explain different elements of\ndesign model.', 7),
(46, '4b', '"Requirement analysis acts  as the bridge between\nsoftware engineering and software design". Explain?', 7),
(47, '4b', 'Explain the transition of Analysis to Design model with\nnecessary figure. Illustrate all the necessary components\nof an analysis model and their equivalent state in the\ndesign model.', 8),
(48, '4b', 'What is analysis model elements? Illustrate', 7),
(49, '4b', 'Write about the different steps you follow in structured \nanalysis in detail.', 7),
(50, '5a', 'What do you mean by system testing? Discuss the\ndifferent type of system testing.', 7),
(51, '5b', 'Using Basis path testing approach draw the flow graph\nand find out the cyclomatic complexity of the following\ncode fragment:\nx=10\ny=5\nz=2\nif x>y and x>z\nmax=x\nelse if y>z\nmax=y\nelse \nmax=z', 7),
(52, '5b', 'Explain basis path testing? Compute cyclomatic complexity\nfrom given peice of program\nlarge = x[0]''\nfor(i=0;i<=n;i++)\n{\n    if(x[i]>large)\n       large=x[i];\n}', 8),
(53, '5a', 'Explain the transform mapping and transaction mapping.\nHow they are related to software', 7),
(54, '5a', 'What are primary objectives when we test software?\nDifferentiate between white box testing and black box \ntesting.', 8),
(55, '5a', 'Explain about test case with a simple example.\nDifferentiate between white box and black box technique.', 7),
(56, '5a', 'Discuss the need of integration testing. Compare \nTop-down integration and bottom-up integration.', 8),
(57, '5b', 'What is white box testing? Discuss in detail the use \nof cyclomatic complexity in basis path testing with an \nexample.', 8),
(58, '6a', 'What is object oriented paradigm? List out the different\nelements of an object model with a suitable example.', 8),
(59, '6a', 'What do you mean by domain analysis? What are the\ndifferent components of object oriented analysis model?', 8),
(60, '6a', 'Describe transformation from OOA model to OOD model.\nUse necessary figure.', 7),
(61, '6a', 'What are the various components required for object \noriented analysis model?', 7),
(62, '6b', 'Describe different characterstics of object oriented\nprogram.', 7),
(63, '6b', 'What are class, object, attributes and methods?\nExplain with appropriate examples.', 7),
(64, '6b', '"Message passing is the way through which objects\ncommunicate with each other". Is it true,if "yes" then \nvalidate your answer taking an example.', 8),
(65, '7a', 'Data dictionary', 5),
(66, '7a', 'Software Architecture', 5),
(67, '7a', 'Software Characterstics', 5),
(68, '7a', 'SRS', 5),
(69, '7b', 'Alpha and beta testing', 5),
(70, '7b', 'Unit and Integration Testing', 5),
(71, '7b', 'Control flow graph', 5),
(72, '7b', 'Use Cases', 5),
(73, '7c', 'ISO 9000 quality standards', 5),
(74, '7c', 'Verification and Validation', 5),
(75, '7c', 'COCOMO model', 5),
(76, '7c', 'ER diagram', 5);

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `name` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`name`) VALUES
('sef'),
('dsa'),
('fit'),
('phy');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `Name` char(10) NOT NULL,
  `Password` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`Name`, `Password`) VALUES
('ashish', '428B6DA53085B8FD7B37E9FB259C0C609BD09984'),
('bibek', '7529AC3778B6CC759557B11C43B014B419012F4B'),
('prakash', 'A0C130080EB83E6EEECB78320E4131E773A90852');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `dsa`
--
ALTER TABLE `dsa`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `fit`
--
ALTER TABLE `fit`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `phy`
--
ALTER TABLE `phy`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `sef`
--
ALTER TABLE `sef`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`Name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dsa`
--
ALTER TABLE `dsa`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `fit`
--
ALTER TABLE `fit`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `phy`
--
ALTER TABLE `phy`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `sef`
--
ALTER TABLE `sef`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=77;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
