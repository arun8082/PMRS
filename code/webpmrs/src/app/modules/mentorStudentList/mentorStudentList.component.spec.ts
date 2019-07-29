import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MentorStudentListComponent } from './mentorStudentList.component';

describe('ProjectlistComponent', () => {
  let component: MentorStudentListComponent;
  let fixture: ComponentFixture<MentorStudentListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MentorStudentListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MentorStudentListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
