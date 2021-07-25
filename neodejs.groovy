job('NodeJS example') {
    scm {
        git('git:github.com/Devyani18/jenkinsdemo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('devyani18')
            node / gitConfigEmail('devyaniparate1996@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        batch("npm install")
    }
}
