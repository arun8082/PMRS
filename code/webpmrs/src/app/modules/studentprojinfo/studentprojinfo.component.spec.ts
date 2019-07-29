import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentprojinfoComponent } from './studentprojinfo.component';

describe('StudentprojinfoComponent', () => {
  let component: StudentprojinfoComponent;
  let fixture: ComponentFixture<StudentprojinfoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentprojinfoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentprojinfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
