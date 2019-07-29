import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MentorProjectListComponent } from './mentorProjectlist.component';

describe('ProjectlistComponent', () => {
  let component: MentorProjectListComponent;
  let fixture: ComponentFixture<MentorProjectListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MentorProjectListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MentorProjectListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
