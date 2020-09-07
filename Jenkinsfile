properties([[$class: 'RebuildSettings', autoRebuild: false, rebuildDisabled: false], parameters([choice(choices: 'Yes\nNo', description: '', name: 'RunTestCases')])])
pipeline {
   agent any
   stages {
        stage('Checkout') {
            steps {
               checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '4d44c06d-7b6f-464e-b8c3-2cd4a4f004b2', url: 'https://github.com/prathibha-k-s/core-java.git']]])   
	    }
	}
          stage('Build'){
              steps{
			  script{
                if("${params.RunTestCases}"=="Yes")
				{
				echo "${params.RunTestCases}"
                  bat 'mvn -f C:/Jekins_Local/Jenkins-2.222.1/workspace/Choice_parameter/MavenWebApp/pom.xml clean install'
				 }
				  else
				{
               echo "${params.RunTestCases}"
                  bat 'mvn -f  C:/Jekins_Local/Jenkins-2.222.1/workspace/Choice_parameter/MavenWebApp/pom.xml clean install -DskipTests'
				  }
				  
                                }  
                  
                    }
              
                        }
	   stage('Read'){
		   steps{
			echo 'this step is for reading the properties file'  
			   node{
			 props = readProperties  file: 'C:/Jekins_Local/Jenkins-2.222.1/workspace/Choice_parameter/MavenWebApp/webLogic.properties'
			   echo "${props}"
			   }
			  
			   
		   }
	   }
	   
	   
          }
}

    
