package co.smartreceipts.android.persistence.database.controllers.impl;

import javax.inject.Inject;

import co.smartreceipts.android.analytics.Analytics;
import co.smartreceipts.android.di.scopes.ApplicationScope;
import co.smartreceipts.android.model.Category;
import co.smartreceipts.android.persistence.DatabaseHelper;

@ApplicationScope
public class CategoriesTableController extends AbstractTableController<Category> {

    @Inject
    public CategoriesTableController(DatabaseHelper databaseHelper, Analytics analytics) {
        super(databaseHelper.getCategoriesTable(), analytics);
    }
}
