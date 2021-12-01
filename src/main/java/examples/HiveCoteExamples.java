package examples;

import experiments.Experiments;
import experiments.data.DatasetLoading;
import tsml.classifiers.EnhancedAbstractClassifier;
import tsml.classifiers.dictionary_based.cBOSS;
import tsml.classifiers.distance_based.ElasticEnsemble;
import tsml.classifiers.hybrids.HIVE_COTE;
import tsml.classifiers.interval_based.TSF;
import tsml.data_containers.TimeSeriesInstances;
import utilities.ClassifierTools;

public class HiveCoteExamples{



    public static void HCComponents1() throws Exception {
       HIVE_COTE hc = new HIVE_COTE();
       EnhancedAbstractClassifier[] clf=new EnhancedAbstractClassifier[3];
       clf[0] = new ElasticEnsemble();
       clf[1]= new cBOSS();
       clf[2] = new TSF();
       String classifier_names[] = {"EE", "cBOSS", "TSF"};
       hc.setClassifiers(clf,classifier_names,null);
       int seed = 0;
       TimeSeriesInstances instances[] = DatasetLoading.sampleChinatownTS(seed);
       hc.setDebug(true);
       hc.buildClassifier(instances[0]);
       double accuracy = ClassifierTools.accuracy(instances[1], hc);
       System.out.println("The accuracy of HIVE_COTE for Computers dataset is "+accuracy);
   }
 /* public static void HCComponents2() throws Exception {
       HIVE_COTE hc = new HIVE_COTE();
       EnhancedAbstractClassifier[] clf=new EnhancedAbstractClassifier[3];
       clf[0] = new ElasticEnsemble();
       clf[1]= new ShapeletTransformClassifier();
       clf[2] = new TSF();
       String classifier_names[] = {"EE", "STC", "TSF"};
       hc.setClassifiers(clf,classifier_names,null);
       int seed = 0;
       Instances instances[] = DatasetLoading.sampleComputers(seed);
       hc.setDebug(true);
       hc.buildClassifier(instances[0]);
       double accuracy = ClassifierTools.accuracy(instances[1], hc);
       System.out.println("The accuracy of HIVE_COTE for Computers dataset is "+accuracy);
   }*/

    public static void expHIVECOTEconf1conf2() throws Exception {
        String[] settings_1=new String[6];
        settings_1[0]="-dp=src/main/java/experiments/data/tsc/";//Where to get data
        settings_1[1]="-rp=Temp/";//Where to write results
        settings_1[2]="-cn=HIVE-COTEconf1conf2"; //Classifier name: See ClassifierLists for valid options
        settings_1[3]="-dn=Chinatown"; //Problem file,
        settings_1[4]="-f=1";//Fold number
        settings_1[5]="-ff=1";//resultsFileFormat
        Experiments.debug=true;
        Experiments.ExperimentalArguments expSettings = new Experiments.ExperimentalArguments(settings_1);
        Experiments.setupAndRunExperiment(expSettings);
    }

    public static void expHIVECOTEv1() throws Exception {
        String[] settings_1=new String[6];
        settings_1[0]="-dp=src/main/java/experiments/data/tsc/";//Where to get data
        settings_1[1]="-rp=Temp/";//Where to write results
        settings_1[2]="-cn=HIVE-COTEv1"; //Classifier name: See ClassifierLists for valid options
        settings_1[3]="-dn=Chinatown"; //Problem file,
        settings_1[4]="-f=1";//Fold number
        settings_1[5]="-ff=1";//resultsFileFormat
        Experiments.debug=true;
        Experiments.ExperimentalArguments expSettings = new Experiments.ExperimentalArguments(settings_1);
        Experiments.setupAndRunExperiment(expSettings);
    }
    public static void expRISE() throws Exception {
        String[] settings_1=new String[6];
        settings_1[0]="-dp=src/main/java/experiments/data/tsc/";//Where to get data
        settings_1[1]="-rp=Temp/";//Where to write results
        settings_1[2]="-cn=RISE"; //Classifier name: See ClassifierLists for valid options
        settings_1[3]="-dn=Chinatown"; //Problem file,
        settings_1[4]="-f=1";//Fold number
        settings_1[5]="-ff=1";//resultsFileFormat
        Experiments.debug=true;
        Experiments.ExperimentalArguments expSettings = new Experiments.ExperimentalArguments(settings_1);
        Experiments.setupAndRunExperiment(expSettings);
    }

    public static void expHIVECOTEv2() throws Exception {
        String[] settings_2=new String[6];
        settings_2[0]="-dp=src/main/java/experiments/data/tsc/";//Where to get data
        settings_2[1]="-rp=Temp/";//Where to write results
        settings_2[2]="-cn=HIVE-COTEv2"; //Classifier name: See ClassifierLists for valid options
        settings_2[3]="-dn=Chinatown"; //Problem file,
        settings_2[4]="-f=1";//1-Fold Cross Validation
        settings_2[5]="-ff=1";//resultsFileFormat
        Experiments.debug=true;
        Experiments.ExperimentalArguments expSettings = new Experiments.ExperimentalArguments(settings_2);
        Experiments.setupAndRunExperiment(expSettings);
    }

    public static void expHIVECOTEconf3Computers() throws Exception {
        String[] settings_2=new String[6];
        settings_2[0]="-dp=src/main/java/experiments/data/tsc/";//Where to get data
        settings_2[1]="-rp=Temp/";//Where to write results
        settings_2[2]="-cn=HIVE-COTEconf3"; //Classifier name: See ClassifierLists for valid options
        settings_2[3]="-dn=Computers"; //Problem file,
        settings_2[4]="-f=1";//1-Fold Cross Validation
        settings_2[5]="-ff=1";//resultsFileFormat
        Experiments.debug=true;
        Experiments.ExperimentalArguments expSettings = new Experiments.ExperimentalArguments(settings_2);
        Experiments.setupAndRunExperiment(expSettings);
    }

    public static void expHIVECOTEconf4Computers() throws Exception {
        String[] settings_2=new String[6];
        settings_2[0]="-dp=src/main/java/experiments/data/tsc/";//Where to get data
        settings_2[1]="-rp=Temp/";//Where to write results
        settings_2[2]="-cn=HIVE-COTEconf4"; //Classifier name: See ClassifierLists for valid options
        settings_2[3]="-dn=Chinatown"; //Problem file,
        settings_2[4]="-f=1";//1-Fold Cross Validation
        settings_2[5]="-ff=1";//resultsFileFormat
        Experiments.debug=true;
        Experiments.ExperimentalArguments expSettings = new Experiments.ExperimentalArguments(settings_2);
        Experiments.setupAndRunExperiment(expSettings);
    }

    public static void experimentHC1() throws Exception {
        String[] settings_3=new String[6];
        settings_3[0]="-dp=src/main/java/experiments/data/tsc/";//Where to get data
        settings_3[1]="-rp=Temp/";//Where to write results
        settings_3[2]="-cn=HIVE-COTEv0"; //Classifier name: See ClassifierLists for valid options
        settings_3[3]="-dn=Chinatown"; //Problem file,
        settings_3[4]="-f=1";// Cross Validation
        settings_3[5]="-ff=1"; //resultsFileFormat
        Experiments.debug=true;
        Experiments.ExperimentalArguments expSettings = new Experiments.ExperimentalArguments(settings_3);
        Experiments.setupAndRunExperiment(expSettings);
    }

    public static void expHC2contractTime1Min() throws Exception {
        String[] settings_4=new String[7];
        settings_4[0]="-dp=src/main/java/experiments/data/tsc/";//Where to get data
        settings_4[1]="-rp=Temp/";//Where to write results
        settings_4[2]="-cn=HIVE-COTEv2"; //Classifier name: See ClassifierLists for valid options
        settings_4[3]="-dn=Beef"; //Problem file,
        settings_4[4]="-f=1";// Cross Validation
        settings_4[5]="-ctr=1M";
        settings_4[6]="-ff=1"; //resultsFileFormat
        Experiments.debug=true;
        Experiments.ExperimentalArguments expSettings = new Experiments.ExperimentalArguments(settings_4);
        Experiments.setupAndRunExperiment(expSettings);
    }

    public static void expHC2contractTime15Seconds() throws Exception {
        String[] settings_5=new String[7];
        settings_5[0]="-dp=src/main/java/experiments/data/tsc/";//Where to get data
        settings_5[1]="-rp=Temp/";//Where to write results
        settings_5[2]="-cn=HIVE-COTEv2"; //Classifier name: See ClassifierLists for valid options
        settings_5[3]="-dn=Chinatown"; //Problem file,
        settings_5[4]="-f=1";// Cross Validation
        settings_5[5]="-ctr=15s";
        settings_5[6]="-ff=1"; //resultsFileFormat

        Experiments.debug=true;
        Experiments.ExperimentalArguments expSettings = new Experiments.ExperimentalArguments(settings_5);
        Experiments.setupAndRunExperiment(expSettings);
    }

    public static void expHC2contractTime30Seconds() throws Exception {
        String[] settings_4=new String[6];
        settings_4[0]="-dp=src/main/java/experiments/data/tsc/";//Where to get data
        settings_4[1]="-rp=Temp/";//Where to write results
        settings_4[2]="-cn=HIVE-COTEv2"; //Classifier name: See ClassifierLists for valid options
        settings_4[3]="-dn=Chinatown"; //Problem file,
        settings_4[4]="-f=1";// Cross Validation
        settings_4[5]="-ctr=30s";
        Experiments.debug=true;
        Experiments.ExperimentalArguments expSettings = new Experiments.ExperimentalArguments(settings_4);
        Experiments.setupAndRunExperiment(expSettings);
    }

    public static void expHC1contractTime300Seconds() throws Exception {
        String[] settings_4=new String[5];
        settings_4[0]="-dp=src/main/java/experiments/data/tsc/";//Where to get data
        settings_4[1]="-rp=Temp/";//Where to write results
        settings_4[2]="-cn=HC-1"; //Classifier name: See ClassifierLists for valid options
        settings_4[3]="-dn=Chinatown"; //Problem file,
        settings_4[4]="-f=1";// Cross Validation
        //settings_4[5]="-ctr=300s";
        Experiments.debug=true;
        Experiments.ExperimentalArguments expSettings = new Experiments.ExperimentalArguments(settings_4);
        Experiments.setupAndRunExperiment(expSettings);
    }



    public static void main(String args[]) throws Exception {
        long t =System.nanoTime();

        //HCComponents1();
        //HCComponents2();
        //expRISE();
        expHIVECOTEv2();
        expHIVECOTEv1();
        //expHIVECOTEconf2Computers();
        //expHIVECOTEconf3Computers();
        //expHIVECOTEconf4Computers();
        //expHIVECOTEconf1conf2();
        //experimentHC1NoCV();
        //experimentHC1With5Fold();
        //experimentHC1();
        //expHC2contractTime1Min();
        //expHC2contractTime1Min();
        //expHC2contractTime30Seconds();
        //expHC2contractTime15Seconds();
        //expHC1contractTime300Seconds();
        t =System.nanoTime()-t;
        System.out.println("\t\t Time elapsed = "+t/1000000000+" seconds");
    }


}
