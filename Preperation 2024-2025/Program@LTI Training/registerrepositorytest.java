public class RegistrationRepository {

    public contactsDAO dao;
    public LiveData<List<contacts_bean>>data;

    public RegistrationRepository(Application application){
        RegistrationDatabase database = RegistrationDatabase.getDatabase(application);
        this.dao = database.registrationDao();
        this.data =  dao.getDetails();
    }
    LiveData<List<contacts_bean>>getDetails(){ return data;
    }

    public void insert(contacts_bean contactdata){
        new RegistraionInseration(dao).execute(contactdata);
    }

    private class RegistraionInseration {
        public RegistraionInseration(contactsDAO dao) {
        }
    }
}

