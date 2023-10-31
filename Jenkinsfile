pipeline{
   agent any
      stages{
         stage('build')
	 {
	 steps{
          echo "hello this is build"
	  bat 'mvn clean install'
	  }
	 }
	stage('image')
	{
		steps{
			echo "making image"
			bat 'docker build -t customer-svc/jpg .'
		}
	}
	stage('container')
	{
		steps{
			echo "making and running container"
			bat 'docker run -d --name customer-container -p 8083:8083 customer-svc/jpg'
		}
	}
      }

   
}
