package com.competentum.razuna_rest_uploader.storage;


    public class StorageFileNotFoundException extends StorageException {

        public StorageFileNotFoundException(String message) {
            super(message);
        }

        public StorageFileNotFoundException(String message, Throwable cause) {
            super(message, cause);
        }
    }
