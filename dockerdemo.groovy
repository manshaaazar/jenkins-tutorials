job('NodeJs Docker Examp'){
   scm {
        git('git://github.com/manshaaazar/demo-node.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('manshaaazar')
            node / gitConfigEmail('manshaehsan000@gmail.com')
        }
   }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        dockerBuildAndPublish{
            repositoryName('manshaehsan/jenkins-tutorials')
            tag('${GIT_REVISION,length=9}')
            registryCredentials('dockerhub')
            forcePull(false)
            forceTag(false)
            createFingerprints(false)
            skipDecorate()
        }
    }
}
