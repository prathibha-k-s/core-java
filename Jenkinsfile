properties([[$class: 'RebuildSettings', autoRebuild: false, rebuildDisabled: false], parameters([choice(choices: 'Yes\nNo', description: '', name: 'RunTestCases')])])
pipeline {
   agent any
   stages {
        stage('Checkout') {
            steps {
               checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'feb5fd15-05c3-4c4e-8a8d-0681de723987', url: 'https://github.aepsc.com/AEP/MDMIntegrations.git']]])}
          }
          stage('Build'){
              steps{
			  script{
                if("${params.RunTestCases}"=="Yes")
				{
				echo "${params.RunTestCases}"
                  bat 'mvn -f  C:/Jekins_Local/Jenkins-2.222./workspace/maven_weblogicDeploy/MavenWebApp/pom.xml clean install'
				 }
				  else
				{
               echo "${params.RunTestCases}"
                  bat 'mvn -f  C:/Jekins_Local/Jenkins-2.222./workspace/maven_weblogicDeploy/MavenWebApp/pom.xml clean install -DskipTests'
				  }
				  
                                }  
                  
                    }
              
                        }
	   
	    stage('Read'){
	        stepas{
		 echo 'this step for reading properties file'
	              }
		      
                          }
          }
}
    
