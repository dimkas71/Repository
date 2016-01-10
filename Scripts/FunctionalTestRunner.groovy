def pathTo1C = "C:\\Program Files\\1cv8\\common\\1cestart.exe ENTERPISE /F "
def dbPath = "D:\\1C\\TisForUkraine1c83"

def clientManagerString = ""

if (args) {
    //Possible values {client, manager}
    if (args[0].toLowerCase() == 'client') {
        clientManagerString = "/TESTCLIENT"
    } else if (args[0].toLowerCase() == 'manager') {
        clientManagerString = "/TESTMANAGER"
    } else {
        throw new RuntimeException("Usage: groovy FunctionalTestRunner.groovy (client|manager)")
    }
} else {
    throw new RuntimeException("Usage: groovy FunctionalTestRunner.groovy (client|manager)")
}

def command = "$pathTo1C $dbPath $clientManagerString"

command.execute()
