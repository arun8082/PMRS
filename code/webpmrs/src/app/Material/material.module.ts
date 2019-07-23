import { NgModule } from  '@angular/core';
import {MatNativeDateModule,MatSnackBarModule,MatIconModule,MatDialogModule, MatButtonModule, MatTableModule, MatPaginatorModule , MatSortModule,MatTabsModule, MatCheckboxModule, MatToolbarModule, MatCard, MatCardModule, MatFormField, MatFormFieldModule, MatProgressSpinnerModule, MatInputModule } from  '@angular/material';
import {MatDatepickerModule} from  '@angular/material/datepicker';
import {MatRadioModule} from  '@angular/material/radio';
import {MatSelectModule} from  '@angular/material/select';
import {MatSliderModule} from  '@angular/material/slider';
import {MatDividerModule} from  '@angular/material/divider';
import {MatSidenavModule, MatListModule} from '@angular/material';


//const material = [MatSidenavModule];

@NgModule({
imports: [MatTabsModule,MatDividerModule,
    MatSliderModule,MatSelectModule,MatRadioModule,
    MatNativeDateModule,MatDatepickerModule,
    MatSnackBarModule,MatIconModule,MatDialogModule,MatProgressSpinnerModule
    ,MatButtonModule,MatSortModule,MatTableModule,MatTabsModule, MatCheckboxModule,
     MatToolbarModule, MatCardModule, MatFormFieldModule,
      MatProgressSpinnerModule, MatInputModule, MatPaginatorModule,MatSidenavModule],
exports: [MatTabsModule,MatDividerModule,MatSliderModule,
    MatSelectModule,MatRadioModule,MatNativeDateModule,MatDatepickerModule,
    MatSnackBarModule,MatIconModule,MatDialogModule,MatProgressSpinnerModule,MatButtonModule,
    MatSortModule, MatCheckboxModule, MatToolbarModule, MatCardModule,MatTableModule,MatTabsModule,
     MatFormFieldModule, MatProgressSpinnerModule, MatInputModule, MatPaginatorModule, MatSidenavModule,MatListModule],

})

export  class  MyMaterialModule {

 }