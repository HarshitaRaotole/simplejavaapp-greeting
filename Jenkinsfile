node {
    // Define the project name
    def projectName = 'simplejavaapp-greeting'

    try {
        // Checkout the code from GitHub repository
        stage('Checkout') {
            echo "Checking out the code from repository..."
            checkout scm  // Fetch the code from the configured Git repository
        }

        // Build the Java project using Maven
        stage('Build') {
            echo "Building the Java project..."
            sh 'mvn clean install'  // Build the project
        }

        // Run unit tests using Maven
        stage('Test') {
            echo "Running unit tests..."
            sh 'mvn test'  // Run the tests
        }

        // Deployment stage (This can be a placeholder or actual deployment)
        stage('Deploy') {
            echo "Deploying the application..."
            // Placeholder for your deployment logic
            echo "Deployment completed!"
        }

    } catch (Exception e) {
        // Mark the build as failed if an error occurs
        currentBuild.result = 'FAILURE'
        throw e
    } finally {
        echo "Pipeline execution completed."
    }
}
