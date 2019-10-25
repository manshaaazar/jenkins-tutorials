job('NodeJS Example'){
    scm{
        git('git://github.com/manshaaazar/demo-node.git'){ node ->
        node / gitConfigName('manshaaazar')
        node / gitConfigEmail('manshaehsan000@gmail.com')

        }
    }
    triggers{
        scm('H/5 * * * *')
    }
    wrappers{
        nodejs('nodejs')
    }
    steps{
        shell("npm install")
    }
}