def call (tomcatip,user){
  sshagent(['tomcat-deploy']) {
                    sh "scp -o StrictHostKeyChecking=no target/ai-leads.war $user@$tomcatip:/opt/tomcat9/webapps"
                    sh "ssh $user@$tomcatip /opt/tomcat9/bin/shutdown.sh"
                    sh "ssh $user@$tomcatip /opt/tomcat9/bin/startup.sh" 
                }   
}
